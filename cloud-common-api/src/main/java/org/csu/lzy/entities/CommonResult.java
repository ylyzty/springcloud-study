package org.csu.lzy.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author LZY
 * @create 2020-08-11
 * @param <T>
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T data;


    public CommonResult(Integer code, String message){
        this(code,message,null);
    }
}
