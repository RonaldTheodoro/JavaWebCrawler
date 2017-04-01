package com.baalze.bal;

import java.sql.Timestamp;
import java.util.Date;

public class CommonBal {

    public static Timestamp getTimestamp() {
        Date date = new Date();
        return new Timestamp(date.getTime());
    }
}
