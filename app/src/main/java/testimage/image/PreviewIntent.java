package testimage.image;

import android.content.Context;
import android.content.Intent;

import java.util.ArrayList;

import me.iwf.photopicker.PhotoPagerActivity;

/**
 * Created by yeming on 2015/9/23.
 */
public final class PreviewIntent extends Intent {

    public PreviewIntent(Context packageContext) {
        super(packageContext, PhotoPagerActivity.class);
    }

    public void setCurrentItem(int currentItem) {
        this.putExtra(PhotoPagerActivity.EXTRA_CURRENT_ITEM, currentItem);
    }

    public void setPhotoPaths(ArrayList<String> photoPaths) {
        this.putStringArrayListExtra(PhotoPagerActivity.EXTRA_PHOTOS, photoPaths);
    }
}
