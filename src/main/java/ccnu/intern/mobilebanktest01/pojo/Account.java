package ccnu.intern.mobilebanktest01.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author intern
 * @since 2024-07-15
 */
@Getter
@Setter
public class Account implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String accountName;

    private String password;

    private BigDecimal balance;

    private Integer statusId;

    private Integer personId;


}
