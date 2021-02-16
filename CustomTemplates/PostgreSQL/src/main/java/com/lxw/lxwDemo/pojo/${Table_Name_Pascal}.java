package ${PackageName}.pojo;

import org.springframework.format.annotation.DateTimeFormat;
import java.math.BigDecimal;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

/**
 * ${Table_Comments}
 * ${Author}
 * ${Date}
 */
public class ${Table_Name_Pascal} {

<for-ltCols>
    /**
     * ${Col.Column_Comments}
     */
    private ${Col.Column_Name_Java_Type} ${Col.Column_Name_Camel};
</for-ltCols>
    
<for-ltCols>
    public ${Col.Column_Name_Java_Type} get${Col.Column_Name_Pascal}() {
        return ${Col.Column_Name_Camel};
    }
 
    public void set${Col.Column_Name_Pascal}(${Col.Column_Name_Java_Type} ${Col.Column_Name_Camel}) {
        this.${Col.Column_Name_Camel} = ${Col.Column_Name_Camel};
    }
</for-ltCols>

}
