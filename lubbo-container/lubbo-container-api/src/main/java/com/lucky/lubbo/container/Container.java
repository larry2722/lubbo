/**  
 * Copyright:   Copyright (c) 2014
 * Company:     LuckyStar Lubbo
 * @author:     Larry.Li  
 * @version:    v1.0.0
 * Create Date: 2014年2月21日 下午3:09:31
 */
package com.lucky.lubbo.container;

import com.lucky.lubbo.common.extension.SPI;

@SPI("spring")
public interface Container {

	/**
     * start.
     */
    void start();
    
    /**
     * stop.
     */
    void stop();
}
