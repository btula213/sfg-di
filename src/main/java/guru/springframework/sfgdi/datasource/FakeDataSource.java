package guru.springframework.sfgdi.datasource;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FakeDataSource {
    private String username;
    private String password;
    private String jdbcurl;

}
