import javax.swing.*;

import java.awt.event.*;

public class ChessGame extends JFrame {
    private JButton[][] boardButtons = new JButton[8][8];
    private Piece[][] board = new Piece[8][8];
    private int selectedRow = -1, selectedCol = -1;

    public ChessGame() {
        setTitle("Java Chess");
        setSize(600, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(8, 8));

        initBoard();
        initGUI();

        setVisible(true);
    }

    private void initBoard() {
        // Pawns
        for (int i = 0; i < 8; i++) {
            board[1][i] = new Piece("BP");
            board[6][i] = new Piece("WP");
        }
        // Rooks
        board[0][0] = board[0][7] = new Piece("BR");
        board[7][0] = board[7][7] = new Piece("WR");
        // Knights
        board[0][1] = board[0][6] = new Piece("BN");
        board[7][1] = board[7][6] = new Piece("WN");
        // Bishops
        board[0][2] = board[0][5] = new Piece("BB");
        board[7][2] = board[7][5] = new Piece("WB");
        // Queens & Kings
        board[0][3] = new Piece("BQ");
        board[0][4] = new Piece("BK");
        board[7][3] = new Piece("WQ");
        board[7][4] = new Piece("WK");
    }

    private void initGUI() {
        for (int r = 0; r < 8; r++) {
            for (int c = 0; c < 8; c++) {
                JButton btn = new JButton();
                btn.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 24));
                boardButtons[r][c] = btn;
                updateButton(r, c);
                final int rr = r, cc = c;
                btn.addActionListener(e -> onSquareClick(rr, cc));
                add(btn);
            }
        }
    }

    private void updateButton(int r, int c) {
        Piece p = board[r][c];
        boardButtons[r][c].setText(p == null ? "" : p.code);
    }

    private void onSquareClick(int r, int c) {
        if (selectedRow == -1) {
            if (board[r][c] != null) {
                selectedRow = r;
                selectedCol = c;
                boardButtons[r][c].setBackground(Color.YELLOW);
            }
        } else {
            if (isValidMove(selectedRow, selectedCol, r, c)) {
                board[r][c] = board[selectedRow][selectedCol];
                board[selectedRow][selectedCol] = null;
            }
            resetButtonColors();
            updateBoard();
            selectedRow = selectedCol = -1;
        }
    }

    private void resetButtonColors() {
        for (int r = 0; r < 8; r++)
            for (int c = 0; c < 8; c++)
                boardButtons[r][c].setBackground((r + c) % 2 == 0 ? Color.WHITE : Color.LIGHT_GRAY);
    }

    private boolean isValidMove(int sr, int sc, int tr, int tc) {
        // Allow simple move to empty or capture only
        return board[sr][sc] != null &&
               (board[tr][tc] == null || !board[tr][tc].code.startsWith(board[sr][sc].code.substring(0,1)));
    }

    private void updateBoard() {
        for (int r = 0; r < 8; r++)
            for (int c = 0; c < 8; c++)
                updateButton(r, c);
    }

    static class Piece {
        String code; // e.g. "WP" white pawn, "BK" black king
        Piece(String code) { this.code = code; }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ChessGame::new);
    }
}
