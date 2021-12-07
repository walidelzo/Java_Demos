
/*-----------------------------------------------------------------------------
 - Copyright (c) Walid Elzohery ٧‏/١٢‏/٢٠٢١ ٢:١٧ م.                           -
 - All right Reserved.                                                        -
 -----------------------------------------------------------------------------*/

package com.company.threads;

import java.util.Date;

public class ThreadTestNew extends Thread {

    @Override
    public void run() {
        while(true){
            try {Thread.sleep(1000);}catch (Exception e){};
            System.out.println(System.currentTimeMillis());

        }
    }
}
