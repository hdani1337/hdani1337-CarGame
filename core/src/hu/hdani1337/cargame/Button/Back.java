package hu.hdani1337.cargame.Button;

import hu.hdani1337.cargame.Global.Assets;
import hu.hdani1337.cargame.MyBaseClasses.Scene2D.OneSpriteStaticActor;

public class Back extends OneSpriteStaticActor {
    public Back() {
        super(Assets.manager.get(Assets.BACK_TEXTURE));
        setDebug(false);
        setSize(200,200);
    }
}
