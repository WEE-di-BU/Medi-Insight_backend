package ynu.mediinsight.MediInsightBackend.entity.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@TableName("procedure")
public class Procedure {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String code;
    private String name;
    private Integer vid;
}