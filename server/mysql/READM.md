# master

```sql
# slave账号进行主从的同步
grant replication slave on *.* to 'slave'@'%' identified by 'slave';
flush privileges;
show master status;
```

# slave
```sql
# 重制主从
reset slave;
# 配置要同步的主库
change master to master_host= 'master', master_user='slave', master_password='slave', 
master_log_file='基于show master status的结果配置', master_log_pos= 基于show master status的结果配置
# 开始同步
start slave;
# 查看状态
show slave status;
    
# 添加read账号
grant select  on xm_program_exam.* to 'read'@'%' IDENTIFIED by 'read';
flush PRIVILEGES;    
```
