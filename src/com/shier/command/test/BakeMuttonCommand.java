package com.shier.command.test;



/**
 * @author Shier
 * CreateTime 2023/5/20 15:22
 * 烤羊肉命令类
 */
public class BakeMuttonCommand extends Command {
    public BakeMuttonCommand(Barbecuer barbecuer) {
        super(barbecuer);
    }

    @Override
    public void excuteCommand() {
        barbecuer.bakeMutton();
    }
}
