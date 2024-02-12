package HW_3.test;

import HW_3.User;
import HW_3.UserRepository;

class UserRepositoryTest {
    private UserRepository userRepository;

    @BeforeEach
    void setUp() {
        userRepository = new UserRepository();
    }

    @AfterEach
    void tearDown() {
        userRepository = null;
    }

    @Test
    @DisplayName("Проверка метода добавления пользователя в общий список")
    void testAddUser() {
        User adminUser = new User("admin", "pass321", true);
        User regularUser = new User("user1", "qwerty", false);
        userRepository.addUser(adminUser);
        assertTrue(userRepository.findByName("admin"));

        userRepository.addUser(regularUser);
        assertTrue(userRepository.findByName("user1"));
    }

    @Test
    @DisplayName("Проверка метода поиска пользователя по логину в общем списке")
    void testFindByName() {
        User user = new User("testUser", "password", false);
        userRepository.addUser(user);

        assertTrue(userRepository.findByName("testUser"));
        assertFalse(userRepository.findByName("unanimous"));
    }

    @Test
    @DisplayName("Проверка метода разлогирования всех пользователей кроме администратора")
    void testLogOutAllExceptAdmins() {
        User adminUser = new User("admin", "pass321", true);
        User regularUser = new User("user1", "qwerty", false);
        userRepository.addUser(adminUser);
        userRepository.addUser(regularUser);

        userRepository.logOutAllExceptAdmins();

        assertTrue(adminUser.isAuthenticate);
        assertFalse(regularUser.isAuthenticate);
    }

    @Test
    @DisplayName("Проверка метода разлогирования всех пользователей")
    void testLogOutAll() {
        User adminUser = new User("admin", "pass321", true);
        User regularUser = new User("user1", "qwerty", false);
        userRepository.addUser(adminUser);
        userRepository.addUser(regularUser);

        userRepository.logOutAll();

        assertFalse(adminUser.isAuthenticate);
        assertFalse(regularUser.isAuthenticate);
    }

}
