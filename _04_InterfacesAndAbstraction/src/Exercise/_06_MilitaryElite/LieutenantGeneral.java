package Exercise._06_MilitaryElite;

import java.util.Collection;

public interface LieutenantGeneral extends Private {
    void addPrivate(Private priv);
    Collection<Private> getPrivates();
}
