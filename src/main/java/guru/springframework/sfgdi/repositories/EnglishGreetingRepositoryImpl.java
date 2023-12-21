package guru.springframework.sfgdi.repositories;

/**
 * @author john
 * @since 21/12/2023
 */
public class EnglishGreetingRepositoryImpl implements EnglishGreetingRepository{
    @Override
    public String getGreeting() {
        return "Hello World - EN";
    }
}
