package com.lcs.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/*添加一个构造函数，该构造函数含有所有已声明字段属性参数*/
@AllArgsConstructor
/*创建一个无参构造函数*/
@NoArgsConstructor
/*自动添加Getter,Setter,equals,canEqual,hasCode,toString等方法*/
@Data
/*chain 若为true，则setter方法返回当前对象,而不是void：如：public DeptEntity seteptNo(Long deptNo){}*/
@Accessors(chain = true)
public class DeptEntity implements Serializable {
    /**
     * 部门编码 主键
     */
    private Long deptNo;
    /**
     * 部门名称
     */
    private String deptName;
    /**
     * 数据库名称
     */
    private String dbSource; //来自哪一个数据库，因为微服务一个服务对应一个数据库，同一信息被存到不同数据库
}
