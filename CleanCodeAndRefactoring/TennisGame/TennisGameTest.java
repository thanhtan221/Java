package CleanCodeAndRefactoring;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;

    @RunWith(Parameterized.class)
    public class TennisGameTest {

        public static final String LOVE_ALL = "Love-All";
        public static final String FIFTEEN_ALL = "Fifteen-All";
        public static final String THIRTY_ALL = "Thirty-All";
        public static final String FORTY_ALL = "Forty-All";
        public static final String DEUCE = "Deuce";
        public static final String FIFTEEN_LOVE = "Fifteen-Love";
        public static final String LOVE_FIFTEEN = "Love-Fifteen";
        public static final String THIRTY_LOVE = "Thirty-Love";
        public static final String LOVE_THIRTY = "Love-Thirty";
        public static final String FORTY_LOVE = "Forty-Love";
        public static final String LOVE_FORTY = "Love-Forty";
        public static final String WIN_FOR_PLAYER_1 = "Win for player1";
        public static final String WIN_FOR_PLAYER_2 = "Win for player2";
        public static final String THIRTY_FIFTEEN = "Thirty-Fifteen";
        public static final String FIFTEEN_THIRTY = "Fifteen-Thirty";
        public static final String FORTY_FIFTEEN = "Forty-Fifteen";
        public static final String FIFTEEN_FORTY = "Fifteen-Forty";
        public static final String WIN_FOR_PLAYER_11 = "Win for player1";
        public static final String WIN_FOR_PLAYER_21 = "Win for player2";
        public static final String FORTY_THIRTY = "Forty-Thirty";
        public static final String THIRTY_FORTY = "Thirty-Forty";
        public static final String WIN_FOR_PLAYER_12 = "Win for player1";
        public static final String WIN_FOR_PLAYER_22 = "Win for player2";
        public static final String ADVANTAGE_PLAYER_1 = "Advantage player1";
        public static final String ADVANTAGE_PLAYER_2 = "Advantage player2";
        public static final String ADVANTAGE_PLAYER_11 = "Advantage player1";
        public static final String ADVANTAGE_PLAYER_21 = "Advantage player2";
        public static final String ADVANTAGE_PLAYER_12 = "Advantage player1";
        public static final String ADVANTAGE_PLAYER_22 = "Advantage player2";
        public static final String WIN_FOR_PLAYER_13 = "Win for player1";
        public static final String WIN_FOR_PLAYER_23 = "Win for player2";
        public static final String WIN_FOR_PLAYER_14 = "Win for player1";
        public static final String WIN_FOR_PLAYER_24 = "Win for player2";
        private int player1Score;
        private int player2Score;
        private String expectedScore;

        public TennisGameTest(int player1Score, int player2Score, String expectedScore) {
            this.player1Score = player1Score;
            this.player2Score = player2Score;
            this.expectedScore = expectedScore;
        }

        @Parameterized.Parameters
        public static Collection<Object[]> getAllScores() {
            List<Object[]> objects = Arrays.asList(new Object[][]{
                    {0, 0, LOVE_ALL},
                    {1, 1, FIFTEEN_ALL},
                    {2, 2, THIRTY_ALL},
                    {3, 3, FORTY_ALL},
                    {4, 4, DEUCE},

                    {1, 0, FIFTEEN_LOVE},
                    {0, 1, LOVE_FIFTEEN},
                    {2, 0, THIRTY_LOVE},
                    {0, 2, LOVE_THIRTY},
                    {3, 0, FORTY_LOVE},
                    {0, 3, LOVE_FORTY},
                    {4, 0, WIN_FOR_PLAYER_1},
                    {0, 4, WIN_FOR_PLAYER_2},

                    {2, 1, THIRTY_FIFTEEN},
                    {1, 2, FIFTEEN_THIRTY},
                    {3, 1, FORTY_FIFTEEN},
                    {1, 3, FIFTEEN_FORTY},
                    {4, 1, WIN_FOR_PLAYER_11},
                    {1, 4, WIN_FOR_PLAYER_21},

                    {3, 2, FORTY_THIRTY},
                    {2, 3, THIRTY_FORTY},
                    {4, 2, WIN_FOR_PLAYER_12},
                    {2, 4, WIN_FOR_PLAYER_22},

                    {4, 3, ADVANTAGE_PLAYER_1},
                    {3, 4, ADVANTAGE_PLAYER_2},
                    {5, 4, ADVANTAGE_PLAYER_11},
                    {4, 5, ADVANTAGE_PLAYER_21},
                    {15, 14, ADVANTAGE_PLAYER_12},
                    {14, 15, ADVANTAGE_PLAYER_22},

                    {6, 4, WIN_FOR_PLAYER_13},
                    {4, 6, WIN_FOR_PLAYER_23},
                    {16, 14, WIN_FOR_PLAYER_14},
                    {14, 16, WIN_FOR_PLAYER_24},
            });
            return objects;
        }

        @Test
        public void checkAllScores() {
            int highestScore = Math.max(this.player1Score, this.player2Score);
            int m_score1 = 0;
            int m_score2 = 0;
            for (int i = 0; i < highestScore; i++) {
                if (i < this.player1Score)
                    m_score1 += 1;
                if (i < this.player2Score)
                    m_score2 += 1;
            }
            assertEquals(this.expectedScore, TennisGame.getScore("John", "Bill", m_score1, m_score2));
        }
}
