#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.com.lyle.projectinitializer.vo;

import lombok.Data;

@Data
public class DemoVO {

    private long transactionId;
    private long amount;
    private String userId;
}
