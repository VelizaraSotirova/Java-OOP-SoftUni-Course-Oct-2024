package Exercise._06_MilitaryElite;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class LieutenantGeneralImpl extends PrivateImpl implements LieutenantGeneral {
    private List<Private> privates;

    public LieutenantGeneralImpl(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName, salary);
        this.privates = new ArrayList<>();
    }

    @Override
    public void addPrivate(Private priv) {
        privates.add(priv);
        privates.sort((p1, p2) -> Integer.compare(p2.getId(), p1.getId()));  // Sort by id descending
    }

    @Override
    public Collection<Private> getPrivates() {
        return privates;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString() + "\nPrivates:");
        for (Private priv : privates) {
            sb.append("\n  ").append(priv.toString());
        }
        return sb.toString();
    }
}
