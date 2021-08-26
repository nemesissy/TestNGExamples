package sandbox;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataProviders {

    @DataProvider
    public Object[][] getData() {
        return new Object[][]{{5, "five"}, {5, "six"}, {5, "six"}, {5, "six"}, {5, "six"}};
    }

    @Test(dataProvider="getData", enabled=true)
    public void instanceDbProvider(int p1, String p2) {
        System.out.println("Instance DataProvider Example: Data(" + p1 + ", " + p2 + ")");
    }
}
