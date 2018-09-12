package demo.ayl.dubbo.provider.dao;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * @author AYL    2018/9/12 16:46
 */
@Getter
@Setter
@ToString(callSuper = true)
public class User implements Serializable {
    private static final long serialVersionUID = 4461351975429784423L;

    private Integer id;

    @NotBlank
    private String name;
}
