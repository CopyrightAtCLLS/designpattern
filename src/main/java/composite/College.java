package composite;

import java.util.ArrayList;
import java.util.List;

public class College extends OrganizationComponent {
    List<OrganizationComponent> organizationComponents = new ArrayList<>();

    public College(String name, String description) {
        super(name, description);
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        organizationComponents.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }

    @Override
    protected void print() {
        System.out.println("----------" + getName() + "----------");
        for (OrganizationComponent organizationComponent : organizationComponents) {
            organizationComponent.print();
        }
    }
}
