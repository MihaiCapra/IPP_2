package composite;

import java.util.ArrayList;
import java.util.List;

public class PostMan {
    private String mName;
    private String mRole;
    private int mOfficeNumber;
    private List<PostMan> mPostManList;

    public PostMan(String name, String role, int officeNumber) {
        this.mName = name;
        this.mRole = role;
        this.mOfficeNumber = officeNumber;
        mPostManList = new ArrayList<>();
    }

    public void add(PostMan e) {
        mPostManList.add(e);
    }

    public void remove(PostMan e) {
        mPostManList.remove(e);
    }

    public List<PostMan> getPostManList() {
        return mPostManList;
    }

    public String toString() {
        return String.format("[NAME: %s][ROLE: %s][OFFICE: %d]", mName, mRole, mOfficeNumber);
    }
}
