package org.bill.entity.base;

import com.mybatisflex.annotation.Column;
import com.mybatisflex.annotation.Id;
import com.mybatisflex.annotation.KeyType;
import lombok.Data;

import java.sql.Timestamp;

@Data
public class BaseEntity {
    @Id(keyType=KeyType.Auto)
    private String id;

    @Column(value = "w_time", onInsertValue = "now()")
    private Timestamp wTime;

    @Column(value = "modified_time", onInsertValue = "now()", onUpdateValue = "now()")
    private Timestamp modifiedTime;
}
