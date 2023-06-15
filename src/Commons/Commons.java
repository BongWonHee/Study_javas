package Commons;

import java.util.UUID;
//유니크 아이디 새성
public class Commons {
    public String generatUuid() {

        return UUID.randomUUID().toString();
    }
}
