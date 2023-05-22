package com.shier.command.test;



/**
 * @author Shier
 * CreateTime 2023/5/20 15:22
 * 烤鸡翅命令类
 */
public class BakeChickenWingCommand extends Command {
    public BakeChickenWingCommand(Barbecuer barbecuer) {
        super(barbecuer);
    }

    @Override
    public void excuteCommand() {
        barbecuer.bakeChickenWing();
    }
}
