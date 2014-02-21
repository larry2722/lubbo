/**  
 * Copyright:   Copyright (c) 2014
 * Company:     LuckyStar Lubbo
 * @author:     Larry.Li  
 * @version:    v1.0.0
 * Create Date: 2014年2月21日 下午3:16:11
 */
package com.lucky.lubbo.common.extension;

@SPI
public interface ExtensionFactory {

	/**
     * Get extension.
     * 
     * @param type object type.
     * @param name object name.
     * @return object instance.
     */
    <T> T getExtension(Class<T> type, String name);
}
