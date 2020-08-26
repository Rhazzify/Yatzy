package no.kristiania.yatzy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class YatzyTest {
    @Test
    void shouldScoreOnes() {
        assertEquals(4, new YatzyGame().score(YatzyCategory.ONES, new int[]{1, 1, 2, 1, 1}));
        assertEquals(2, new YatzyGame().score(YatzyCategory.ONES, new int[]{6, 5, 2, 1, 1}));
    }

    @Test
    void shouldScoreTwos() {
        assertEquals(2, new YatzyGame().score(YatzyCategory.TWOS, new int[]{1, 1, 2, 1, 1}));
        assertEquals(2, new YatzyGame().score(YatzyCategory.TWOS, new int[]{6, 5, 2, 1, 1}));
    }

    @Test
    void shouldScorePair() {
        assertEquals(10, new YatzyGame().score(YatzyCategory.PAIR, new int[]{6, 5, 5, 2, 3}));
        assertEquals(12, new YatzyGame().score(YatzyCategory.PAIR, new int[]{6, 6, 5, 2, 3}));
        assertEquals(12, new YatzyGame().score(YatzyCategory.PAIR, new int[]{5, 5, 6, 6, 3}));
    }

    @Test
    void shouldScoreThreeOfAKind() {
        assertEquals(12, new YatzyGame().score(YatzyCategory.THREE_OF_A_KIND, new int[]{4, 4, 6, 4, 2}));
        assertEquals(18, new YatzyGame().score(YatzyCategory.THREE_OF_A_KIND, new int[]{4, 6, 6, 4, 6}));
    }

    @Test
    void shouldScoreFourOfAKind() {
        assertEquals(16, new YatzyGame().score(YatzyCategory.FOUR_OF_A_KIND, new int[]{4, 4, 4, 4, 2}));
        assertEquals(24, new YatzyGame().score(YatzyCategory.FOUR_OF_A_KIND, new int[]{6, 6, 6, 4, 6}));
    }
}