package com.shier.decorate;

/**
 * @author Shier
 * CreateTime 2023/4/16 22:46
 */
public  class Finery implements ICharacter {
    private ICharacter character;

    public void decorate(ICharacter iCharacter) {
        this.character = iCharacter;
    }

    public  void show(){
        if (this.character !=null){
            this.character.show();
        }
    }
}
