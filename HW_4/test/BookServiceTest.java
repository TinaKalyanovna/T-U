package HW_4.test;

import java.util.List;

import HW_4.Book;
import HW_4.BookRepository;
import HW_4.BookService;

class BookServiceTest {
    
    private BookService bookService;
    private BookRepository bookRepositoryMock;

    @BeforeEach
    void setUp() {
//        создаем мок-объект для BookRepository
        bookRepositoryMock = mock(BookRepository.class);
//        передаем объекту BookService наш мок-объект
        bookService = new BookService(bookRepositoryMock);
    }

    @AfterEach
    void tearDown() {
        bookService = null;
    }

    @Test
    @DisplayName("Проверяем метод поиска книги по id")
    void testFindBookById() {
//        настройка mock-объекта
        when(bookRepositoryMock.findById("123")).thenReturn(new Book("123", "TestBook", "TestAuthor"));
//        вызываем тестируемый метод
        Book result = bookService.findBookById("123");
//        проверяем утверждения
        assertEquals("TestBook", result.getTitle());
        assertEquals("TestAuthor", result.getAuthor());
    }

    @Test
    @DisplayName("Проверяем метод поиска книг из нашего списка")
    void testFindAllBooks() {
        //        настройка mock-объекта
        when(bookRepositoryMock.findAll())
                .thenReturn(List.of(new Book("123", "TestBook", "TestAuthor")));
        //        вызываем тестируемый метод на списке книг
        List<Book> result = bookService.findAllBooks();
        //        проверяем утверждения
        assertEquals(1, result.size());
        assertEquals("TestBook", result.get(0).getTitle());
        assertEquals("TestAuthor", result.get(0).getAuthor());
    }
}
