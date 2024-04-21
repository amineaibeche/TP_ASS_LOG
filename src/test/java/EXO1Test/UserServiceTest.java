package EXO1Test;


import EXO1.*;
import org.jetbrains.kotlin.protobuf.ServiceException;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.mockito.Mockito.*;
@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {
    @Mock
    private UserService eurserviceMock;
    @Mock
    private UserFinder userfincderMock ;
    @Test
    public void getUserByIdTest(){

        User u  = new User("amine" , 1);

        when(eurserviceMock.getUserById(u.getId())).thenReturn(userfincderMock);
        when(userfincderMock.findUserById(u.getId())).thenReturn(u);

        UserRepository  repo = eurserviceMock.getUserById(1);
        User u2 = repo.findUserById(1);

        verify(eurserviceMock).getUserById(1) ;
        verify(userfincderMock).findUserById(1) ;

        Assertions.assertEquals(u2 , u);

    }
}
