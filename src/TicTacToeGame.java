/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.swing.JOptionPane;
import java.util.Random;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author Umesh
 */
public class TicTacToeGame extends javax.swing.JFrame {

    static String currentplayer = "X";
    TicTacToeGame fr;

    /**
     * Creates new form TicTacToeGame
     */
    public TicTacToeGame() {
        initComponents();
    }

    public void playSound1() {
        try {
            File sound = new File("C:\\Users\\Umesh\\OneDrive\\Documents\\NetBeansProjects\\TicTacToe\\src\\Sound\\click1.wav");
            Clip c = AudioSystem.getClip();
            c.open(AudioSystem.getAudioInputStream(sound));
            c.start();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void playSound2() {
        try {
            File sound = new File("C:\\Users\\Umesh\\OneDrive\\Documents\\NetBeansProjects\\TicTacToe\\src\\Sound\\click2.wav");
            Clip c = AudioSystem.getClip();
            c.open(AudioSystem.getAudioInputStream(sound));
            c.start();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void playSound3() {
        try {
            File sound = new File("C:\\Users\\Umesh\\OneDrive\\Documents\\NetBeansProjects\\TicTacToe\\src\\Sound\\click3.wav");
            Clip c = AudioSystem.getClip();
            c.open(AudioSystem.getAudioInputStream(sound));
            c.start();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void soundWin() {
        try {
            File sound = new File("C:\\Users\\Umesh\\OneDrive\\Documents\\NetBeansProjects\\TicTacToe\\src\\Sound\\win_game.wav");
            Clip c = AudioSystem.getClip();
            c.open(AudioSystem.getAudioInputStream(sound));
            c.start();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void soundLost() {
        try {
            File sound = new File("C:\\Users\\Umesh\\OneDrive\\Documents\\NetBeansProjects\\TicTacToe\\src\\Sound\\game_lost.wav");
            Clip c = AudioSystem.getClip();
            c.open(AudioSystem.getAudioInputStream(sound));
            c.start();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void playSound() {
        if (currentplayer == "X") {
            playSound1();
        } else {
            playSound2();
        }
    }

    public void selectPlayer() {
        Random rand = new Random();
        int guess = rand.nextInt(2) + 0;
        System.out.println(guess);
        if (guess == 0) {
            currentplayer = "O";
        } else {
            currentplayer = "X";
        }
    }

    public void changeCurrentPlayer() {
        if (currentplayer == "X") {
            currentplayer = "O";
            display.setText(player2label.getText() + ", Your turn for -> '" + currentplayer + "'.");
        } else {
            currentplayer = "X";
            display.setText(player1label.getText() + ", Your turn for -> '" + currentplayer + "'.");
        }
    }

    public void changePlayer() {
        String temp;
        String num;
        temp = player1label.getText();
        player1label.setText(player2label.getText());
        player2label.setText(temp);
        num = player1score.getText();
        player1score.setText(player2score.getText());
        player2score.setText(num);

    }

    public void checkFilled(int fill) {
        switch (fill) {
            case 1:
                if (two.getText() != "") {
                    two.setEnabled(false);
                }
                if (three.getText() != "") {
                    three.setEnabled(false);
                }
                if (four.getText() != "") {
                    four.setEnabled(false);
                }
                if (five.getText() != "") {
                    five.setEnabled(false);
                }
                if (six.getText() != "") {
                    six.setEnabled(false);
                }
                if (seven.getText() != "") {
                    seven.setEnabled(false);
                }
                if (eight.getText() != "") {
                    eight.setEnabled(false);
                }
                if (nine.getText() != "") {
                    nine.setEnabled(false);
                }
                break;
            case 2:

                if (one.getText() != "") {
                    one.setEnabled(false);
                }
                if (three.getText() != "") {
                    three.setEnabled(false);
                }
                if (four.getText() != "") {
                    four.setEnabled(false);
                }
                if (five.getText() != "") {
                    five.setEnabled(false);
                }
                if (six.getText() != "") {
                    six.setEnabled(false);
                }
                if (seven.getText() != "") {
                    seven.setEnabled(false);
                }
                if (eight.getText() != "") {
                    eight.setEnabled(false);
                }
                if (nine.getText() != "") {
                    nine.setEnabled(false);
                }
                break;
            case 3:
                if (two.getText() != "") {
                    two.setEnabled(false);
                }
                if (one.getText() != "") {
                    one.setEnabled(false);
                }
                if (four.getText() != "") {
                    four.setEnabled(false);
                }
                if (five.getText() != "") {
                    five.setEnabled(false);
                }
                if (six.getText() != "") {
                    six.setEnabled(false);
                }
                if (seven.getText() != "") {
                    seven.setEnabled(false);
                }
                if (eight.getText() != "") {
                    eight.setEnabled(false);
                }
                if (nine.getText() != "") {
                    nine.setEnabled(false);
                }
                break;
            case 4:
                if (two.getText() != "") {
                    two.setEnabled(false);
                }
                if (one.getText() != "") {
                    one.setEnabled(false);
                }
                if (three.getText() != "") {
                    three.setEnabled(false);
                }
                if (five.getText() != "") {
                    five.setEnabled(false);
                }
                if (six.getText() != "") {
                    six.setEnabled(false);
                }
                if (seven.getText() != "") {
                    seven.setEnabled(false);
                }
                if (eight.getText() != "") {
                    eight.setEnabled(false);
                }
                if (nine.getText() != "") {
                    nine.setEnabled(false);
                }
                break;
            case 5:
                if (two.getText() != "") {
                    two.setEnabled(false);
                }
                if (one.getText() != "") {
                    one.setEnabled(false);
                }
                if (four.getText() != "") {
                    four.setEnabled(false);
                }
                if (three.getText() != "") {
                    three.setEnabled(false);
                }
                if (six.getText() != "") {
                    six.setEnabled(false);
                }
                if (seven.getText() != "") {
                    seven.setEnabled(false);
                }
                if (eight.getText() != "") {
                    eight.setEnabled(false);
                }
                if (nine.getText() != "") {
                    nine.setEnabled(false);
                }
                break;
            case 6:
                if (two.getText() != "") {
                    two.setEnabled(false);
                }
                if (one.getText() != "") {
                    one.setEnabled(false);
                }
                if (four.getText() != "") {
                    four.setEnabled(false);
                }
                if (five.getText() != "") {
                    five.setEnabled(false);
                }
                if (three.getText() != "") {
                    three.setEnabled(false);
                }
                if (seven.getText() != "") {
                    seven.setEnabled(false);
                }
                if (eight.getText() != "") {
                    eight.setEnabled(false);
                }
                if (nine.getText() != "") {
                    nine.setEnabled(false);
                }
                break;
            case 7:
                if (two.getText() != "") {
                    two.setEnabled(false);
                }
                if (one.getText() != "") {
                    one.setEnabled(false);
                }
                if (four.getText() != "") {
                    four.setEnabled(false);
                }
                if (five.getText() != "") {
                    five.setEnabled(false);
                }
                if (six.getText() != "") {
                    six.setEnabled(false);
                }
                if (three.getText() != "") {
                    three.setEnabled(false);
                }
                if (eight.getText() != "") {
                    eight.setEnabled(false);
                }
                if (nine.getText() != "") {
                    nine.setEnabled(false);
                }
                break;
            case 8:
                if (two.getText() != "") {
                    two.setEnabled(false);
                }
                if (one.getText() != "") {
                    one.setEnabled(false);
                }
                if (four.getText() != "") {
                    four.setEnabled(false);
                }
                if (five.getText() != "") {
                    five.setEnabled(false);
                }
                if (six.getText() != "") {
                    six.setEnabled(false);
                }
                if (seven.getText() != "") {
                    seven.setEnabled(false);
                }
                if (three.getText() != "") {
                    three.setEnabled(false);
                }
                if (nine.getText() != "") {
                    nine.setEnabled(false);
                }
                break;
            case 9:
                if (two.getText() != "") {
                    two.setEnabled(false);
                }
                if (one.getText() != "") {
                    one.setEnabled(false);
                }
                if (four.getText() != "") {
                    four.setEnabled(false);
                }
                if (five.getText() != "") {
                    five.setEnabled(false);
                }
                if (six.getText() != "") {
                    six.setEnabled(false);
                }
                if (seven.getText() != "") {
                    seven.setEnabled(false);
                }
                if (eight.getText() != "") {
                    eight.setEnabled(false);
                }
                if (three.getText() != "") {
                    three.setEnabled(false);
                }
                break;
        }

    }

    public void disableAll() {
        one.setEnabled(false);
        two.setEnabled(false);
        three.setEnabled(false);
        four.setEnabled(false);
        five.setEnabled(false);
        six.setEnabled(false);
        seven.setEnabled(false);
        eight.setEnabled(false);
        nine.setEnabled(false);
    }

    public void enableAll() {
        one.setEnabled(true);
        two.setEnabled(true);
        three.setEnabled(true);
        four.setEnabled(true);
        five.setEnabled(true);
        six.setEnabled(true);
        seven.setEnabled(true);
        eight.setEnabled(true);
        nine.setEnabled(true);
    }

    public void resetBoard() {
        one.setText("");
        two.setText("");
        three.setText("");
        four.setText("");
        five.setText("");
        six.setText("");
        seven.setText("");
        eight.setText("");
        nine.setText("");
    }

    public void resetAll() {
        resetBoard();
        player1score.setText("0");
        player2score.setText("0");
        tie.setText("0");
    }

    public boolean checkWinner() {
        if (( //check three rows for winner
                one.getText() == two.getText() && one.getText() == three.getText() && one.getText() != ""
                || four.getText() == five.getText() && four.getText() == six.getText() && four.getText() != ""
                || seven.getText() == eight.getText() && seven.getText() == nine.getText() && seven.getText() != "")
                // check three column for winner
                || one.getText() == four.getText() && one.getText() == seven.getText() && one.getText() != ""
                || two.getText() == five.getText() && two.getText() == eight.getText() && two.getText() != ""
                || three.getText() == six.getText() && three.getText() == nine.getText() && three.getText() != ""
                //check two Diagonals for winner
                || one.getText() == five.getText() && one.getText() == nine.getText() && one.getText() != ""
                || three.getText() == five.getText() && three.getText() == seven.getText() && three.getText() != "") {
            increaseScore();
            soundWin();
            if (currentplayer == "X") {
                display.setText("Hurray! '" + player1label.getText() + "' -> '" + currentplayer + "' won this game.");
                JOptionPane.showMessageDialog(fr, "Hurray! '" + player1label.getText() + "' -> '" + currentplayer + "' has won this match.");
            } else {
                display.setText("Hurray! '" + player2label.getText() + "' -> '" + currentplayer + "' won this game.");
                JOptionPane.showMessageDialog(fr, "Hurray! '" + player2label.getText() + "' -> '" + currentplayer + "' has won this match.");
            }
            disableAll();
            enableAll();
            resetBoard();
            changeCurrentPlayer();
            changePlayer();
            return true;
        }
        return false;
//        if (one.getText() == four.getText() && one.getText() == seven.getText() && one.getText() != ""
//                || two.getText() == five.getText() && two.getText() == eight.getText() && two.getText() != ""
//                || three.getText() == six.getText() && three.getText() == nine.getText() && three.getText() != "") {
//            display.setText("Hurray! '" + currentplayer + "' won this game.");
//            disableAll();
//            increaseScore();
//        }
//        if (one.getText() == five.getText() && one.getText() == nine.getText() && one.getText() != ""
//                || three.getText() == five.getText() && three.getText() == seven.getText() && three.getText() != "") {
//            display.setText("Hurray! '" + currentplayer + "' won this game.");
//            disableAll();
//            increaseScore();
//        }
    }

    public void increaseScore() {
        if (currentplayer == "X") {
            player1score.setText(Integer.toString(Integer.parseInt(player1score.getText()) + 1));
        } else {
            player2score.setText(Integer.toString(Integer.parseInt(player2score.getText()) + 1));

        }
    }

    public void checkDraw() {
        if (!checkWinner()) {
            if (one.getText() != "" && two.getText() != "" && three.getText() != ""
                    && four.getText() != "" && five.getText() != "" && six.getText() != ""
                    && seven.getText() != "" && eight.getText() != "" && nine.getText() != "") {
                display.setText("Ohh! the game is drawn.");
                soundLost();
                tie.setText(Integer.toString(Integer.parseInt(tie.getText()) + 1));
                JOptionPane.showMessageDialog(fr, "Ohh! this game is a tie.");
                enableAll();
                resetBoard();
                changeCurrentPlayer();
                changePlayer();
            }
        }
    }

    static void displayFrame2() {
//        TicTacToeGame tic = new TicTacToeGame();
//        tic.setEnabled(false);
        TicTacPlayers players = new TicTacPlayers();
        players.setVisible(true);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        one = new javax.swing.JButton();
        two = new javax.swing.JButton();
        three = new javax.swing.JButton();
        four = new javax.swing.JButton();
        five = new javax.swing.JButton();
        six = new javax.swing.JButton();
        seven = new javax.swing.JButton();
        eight = new javax.swing.JButton();
        nine = new javax.swing.JButton();
        display1 = new javax.swing.JLabel();
        player1label = new javax.swing.JLabel();
        player2label = new javax.swing.JLabel();
        player1score = new javax.swing.JLabel();
        player2score = new javax.swing.JLabel();
        display = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        resetall = new javax.swing.JButton();
        player1label1 = new javax.swing.JLabel();
        player1label2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        resetboard = new javax.swing.JButton();
        player2label1 = new javax.swing.JLabel();
        tie = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic-Tac-Toe Game");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        one.setBackground(new java.awt.Color(153, 204, 255));
        one.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        one.setForeground(new java.awt.Color(102, 102, 102));
        one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });

        two.setBackground(new java.awt.Color(153, 204, 255));
        two.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        two.setForeground(new java.awt.Color(102, 102, 102));
        two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoActionPerformed(evt);
            }
        });

        three.setBackground(new java.awt.Color(153, 204, 255));
        three.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        three.setForeground(new java.awt.Color(102, 102, 102));
        three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeActionPerformed(evt);
            }
        });

        four.setBackground(new java.awt.Color(153, 204, 255));
        four.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        four.setForeground(new java.awt.Color(102, 102, 102));
        four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourActionPerformed(evt);
            }
        });

        five.setBackground(new java.awt.Color(153, 204, 255));
        five.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        five.setForeground(new java.awt.Color(102, 102, 102));
        five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveActionPerformed(evt);
            }
        });

        six.setBackground(new java.awt.Color(153, 204, 255));
        six.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        six.setForeground(new java.awt.Color(102, 102, 102));
        six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixActionPerformed(evt);
            }
        });

        seven.setBackground(new java.awt.Color(153, 204, 255));
        seven.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        seven.setForeground(new java.awt.Color(102, 102, 102));
        seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenActionPerformed(evt);
            }
        });

        eight.setBackground(new java.awt.Color(153, 204, 255));
        eight.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        eight.setForeground(new java.awt.Color(102, 102, 102));
        eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightActionPerformed(evt);
            }
        });

        nine.setBackground(new java.awt.Color(153, 204, 255));
        nine.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        nine.setForeground(new java.awt.Color(102, 102, 102));
        nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineActionPerformed(evt);
            }
        });

        display1.setFont(display1.getFont().deriveFont(display1.getFont().getStyle() | java.awt.Font.BOLD, 16));
        display1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        display1.setText("Scoreboard");

        player1label.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        player1label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        player1label.setText("player1");

        player2label.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        player2label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        player2label.setText("player2");

        player1score.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        player1score.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        player1score.setText("0");
        player1score.setAutoscrolls(true);

        player2score.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        player2score.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        player2score.setText("0");

        display.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        display.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        display.setText("Welcome to the game.");

        resetall.setText("Reset All");
        resetall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetallActionPerformed(evt);
            }
        });

        player1label1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        player1label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        player1label1.setText("(X)");

        player1label2.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        player1label2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        player1label2.setText("(O)");

        resetboard.setText("Reset Board");
        resetboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetboardActionPerformed(evt);
            }
        });

        player2label1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        player2label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        player2label1.setText("Tie");

        tie.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        tie.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tie.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(seven, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(eight, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nine, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(four, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(five, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(six, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(one, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(two, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(three, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(resetboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(resetall, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(display1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(player1score, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(11, 11, 11))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(player1label)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(player1label1)))
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(player2label)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(player1label2))
                                    .addComponent(player2score, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addComponent(tie, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(55, 55, 55)
                                        .addComponent(player2label1))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(display1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(player1label, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(player2label, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(player1label1)
                    .addComponent(player1label2)
                    .addComponent(player2label1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(player2score, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(player1score, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tie, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(one, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(two, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(three, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(four, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(five, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(six, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(seven, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(eight, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nine, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(resetboard)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resetall)
                        .addGap(1, 1, 1)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        display.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneActionPerformed
        // TODO add your handling code here:        
        playSound();
        if (one.getText() == "") {
            one.setText(currentplayer);
            if (checkWinner() == false) {
                checkDraw();
            }
            changeCurrentPlayer();
            int fill = 1;
            checkFilled(fill);
        } else {
            one.setText("");
            changeCurrentPlayer();
        }
    }//GEN-LAST:event_oneActionPerformed

    private void twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoActionPerformed
        // TODO add your handling code here:   
        playSound();
        if (two.getText() == "") {
            two.setText(currentplayer);
            if (checkWinner() == false) {
                checkDraw();
            }
            changeCurrentPlayer();
            int fill = 2;
            checkFilled(fill);
        } else {
            two.setText("");
            changeCurrentPlayer();
        }
    }//GEN-LAST:event_twoActionPerformed

    private void threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeActionPerformed
        // TODO add your handling code here:
        playSound();
        if (three.getText() == "") {
            three.setText(currentplayer);
            if (checkWinner() == false) {
                checkDraw();
            }
            changeCurrentPlayer();
            int fill = 3;
            checkFilled(fill);
        } else {
            three.setText("");
            changeCurrentPlayer();
        }
    }//GEN-LAST:event_threeActionPerformed

    private void fourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourActionPerformed
        // TODO add your handling code here:
        playSound();
        if (four.getText() == "") {
            four.setText(currentplayer);
            if (checkWinner() == false) {
                checkDraw();
            }
            changeCurrentPlayer();
            int fill = 4;
            checkFilled(fill);
        } else {
            four.setText("");
            changeCurrentPlayer();
        }
    }//GEN-LAST:event_fourActionPerformed

    private void fiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveActionPerformed
        // TODO add your handling code here:
        playSound();
        if (five.getText() == "") {
            five.setText(currentplayer);
            if (checkWinner() == false) {
                checkDraw();
            }
            changeCurrentPlayer();
            int fill = 5;
            checkFilled(fill);
        } else {
            five.setText("");
            changeCurrentPlayer();
        }
    }//GEN-LAST:event_fiveActionPerformed

    private void sixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixActionPerformed
        // TODO add your handling code here:
        playSound();
        if (six.getText() == "") {
            six.setText(currentplayer);
            if (checkWinner() == false) {
                checkDraw();
            }
            changeCurrentPlayer();
            int fill = 6;
            checkFilled(fill);
        } else {
            six.setText("");
            changeCurrentPlayer();
        }
    }//GEN-LAST:event_sixActionPerformed

    private void sevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenActionPerformed
        // TODO add your handling code here:
        playSound();
        if (seven.getText() == "") {
            seven.setText(currentplayer);
            if (checkWinner() == false) {
                checkDraw();
            }
            changeCurrentPlayer();
            int fill = 7;
            checkFilled(fill);
        } else {
            seven.setText("");
            changeCurrentPlayer();
        }
    }//GEN-LAST:event_sevenActionPerformed

    private void eightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightActionPerformed
        // TODO add your handling code here:
        playSound();
        if (eight.getText() == "") {
            eight.setText(currentplayer);
            if (checkWinner() == false) {
                checkDraw();
            }
            changeCurrentPlayer();
            int fill = 8;
            checkFilled(fill);
        } else {
            eight.setText("");
            changeCurrentPlayer();
        }
    }//GEN-LAST:event_eightActionPerformed

    private void nineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineActionPerformed
        // TODO add your handling code here:
        playSound();
        if (nine.getText() == "") {
            nine.setText(currentplayer);
            if (checkWinner() == false) {
                checkDraw();
            }
            changeCurrentPlayer();
            int fill = 9;
            checkFilled(fill);
        } else {
            nine.setText("");
            changeCurrentPlayer();
        }
    }//GEN-LAST:event_nineActionPerformed

    private void resetallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetallActionPerformed
        // TODO add your handling code here:
        playSound3();
        resetAll();
        enableAll();
    }//GEN-LAST:event_resetallActionPerformed

    private void resetboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetboardActionPerformed
        // TODO add your handling code here:
        playSound3();
        resetBoard();
        enableAll();
    }//GEN-LAST:event_resetboardActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TicTacToeGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToeGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToeGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToeGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new TicTacToeGame().setVisible(true);
                new TicTacToeGame().selectPlayer();
                displayFrame2();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel display;
    private javax.swing.JLabel display1;
    private javax.swing.JButton eight;
    private javax.swing.JButton five;
    private javax.swing.JButton four;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton nine;
    private javax.swing.JButton one;
    public javax.swing.JLabel player1label;
    public javax.swing.JLabel player1label1;
    public javax.swing.JLabel player1label2;
    private javax.swing.JLabel player1score;
    public javax.swing.JLabel player2label;
    public javax.swing.JLabel player2label1;
    private javax.swing.JLabel player2score;
    private javax.swing.JButton resetall;
    private javax.swing.JButton resetboard;
    private javax.swing.JButton seven;
    private javax.swing.JButton six;
    private javax.swing.JButton three;
    private javax.swing.JLabel tie;
    private javax.swing.JButton two;
    // End of variables declaration//GEN-END:variables
}
