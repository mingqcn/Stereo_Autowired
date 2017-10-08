package soundsystem;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CDPlayerTest {

  @Autowired
  private MediaPlayer cdplayer1;

  
  @Test
  public void playCDPlayer() {
    assertEquals(
        "playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles", 
        cdplayer1.play());
  }

}
