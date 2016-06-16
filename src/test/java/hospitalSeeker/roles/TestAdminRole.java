package hospitalSeeker.roles;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class TestAdminRole extends BaseRoleTest{

    @BeforeMethod
    public void beforeMethod(){
        loginPage.loggingIn(ADMIN_LOGIN, ADMIN_PASSWORD);
    }

    @Test
    public void testAccessToAdminPage() {
        assertTrue(browser.isElementPresent(headerPage.actionsButton), "actionsButton isn't present!");
        assertTrue(browser.isElementPresent(adminPage.allUsersTable), "usersTable isn't present!");
    }

    @AfterMethod
    public void afterMethod() {
        headerPage.logout();
    }

}
