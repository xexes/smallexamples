package com.moelholm.importantstuff;

import java.util.concurrent.TimeUnit;

import javax.ejb.Stateless;

import com.moelholm.profiling.LogMethodExecutionTime;

@Stateless
@LogMethodExecutionTime
public class AuditLoggerBean {

    public void auditLogStuff(String message) {

        try {
            TimeUnit.MILLISECONDS.sleep(39);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

}
