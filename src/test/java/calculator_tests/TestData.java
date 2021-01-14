package calculator_tests;

import org.testng.annotations.DataProvider;

public class TestData {
    @DataProvider(name = "correct addition data")
    public Object[][] provideCorrectAdditionData() {
        return new Object[][]{
                {2, 2, 4},
                {0, 0, 0},
                {3, 0, 3},
                {8561, 284, 8845},
                {7, 5, 12},
                {6, -4, 2},
                {-5, -6, -11},
                {-4678, -7302, -11980},
                {0, -5, -5},
                {5.5, 4.5, 10},
                {-4.5, 5.6, 1.1}, //TODO FAILS REWRITE CALCULATOR USING BigDecimal
                {786787.9, 0.1, 786788},
                {-56.6, -14.25, -70.85}
        };
    }

    @DataProvider(name = "correct subtraction data")
    public Object[][] provideCorrectSubtraction() {
        return new Object[][]{
                {6, 5, 1},
                {0, 0, 0},
                {4, 0, 4},
                {0, 3, -3},
                {9999, 2674, 7325},
                {6, -4, 10},
                {-9, -5, -4},
                {-7002, -9658, 2656},
                {0, -6, 6},
                {2.5, 1.5, 1},
                {6.2, 0.1, 6.1},
                {37154.6, 1.6, 37153},
                {-58.6, -9.35, -49.25}
        };
    }

    @DataProvider(name = "correct multiplication data")
    public Object[][] provideCorrectMultiplicationData() {
        return new Object[][]{
                {3, 2, 6},
                {0, 0, 0},
                {4, 0, 0},
                {0, 6, 0},
                {435, 965, 419775},
                {4, -7, -28},
                {-3, -9, 27},
                {-901, -820, 738820},
                {0, -8, 0},
                {6.5, 2, 13},
                {4.7, 7.1, 33.37},
                {740.4, 98.36, 72825.744},
                {-54.3, 9.5, -515.85},
                {-3.45, -2.5, 8.625},

        };
    }

    @DataProvider(name = "correct division data")
    public Object[][] provideCorrectDivisionData() {
        return new Object[][]{
                {8, 4, 2},
                {0, 6, 0},
                {80000, 25000, 3.2},
                {-56, 8, -7},
                {-21, -3, 7},
                {9, 5, 1.8},
                {4, 4, 1},
                {7, 14, 0.5},
                {-68535, -50, 1370.7},
                {-256.45, 0.5, -512.9},
                {-8184.552, -85.9, 95.28}
        };
    }

//    @DataProvider(name = "incorrect addition data")
//    public Object[][] provideIncorrectAdditionData() {
//        return new Object[][]{
//                {, ,},
//                {, ,},
//                {, ,},
//                {, ,},
//                {, ,}
//        };
//    }
//
//    @DataProvider(name = "incorrect subtraction data")
//    public Object[][] provideIncorrectSubtraction() {
//        return new Object[][]{
//                {, ,},
//                {, ,},
//                {, ,},
//                {, ,},
//                {, ,}
//        };
//    }
//
//    @DataProvider(name = "incorrect multiplication data")
//    public Object[][] provideIncorrectMultiplicationData() {
//        return new Object[][]{
//                {, ,},
//                {, ,},
//                {, ,},
//                {, ,},
//                {, ,}
//        };
//    }
//
//    @DataProvider(name = "incorrect division data")
//    public Object[][] provideIncorrectDivisionData() {
//        return new Object[][]{
//                {, ,},
//                {, ,},
//                {, ,},
//                {, ,},
//                {, ,}
//        };
//    }
}
