package testimage.image;

import android.content.Context;
import android.content.Intent;

import java.util.ArrayList;

import me.iwf.photopicker.utils.PhotoPickerIntent;


/**
 * 包装PhotoPicker library的工具类
 * Created by yeming on 2015/9/22.
 */
public final class ImageHandleUtils {

    /**
     * 选择一张图片
     * @param context
     * @param showTakePhotoItem  是否有拍照选项
     * @return
     */
    public static Intent pickSingleImage(Context context, boolean showTakePhotoItem) {
        PhotoPickerIntent intent = new PhotoPickerIntent(context);
        intent.setPhotoCount(1);
        intent.setShowCamera(showTakePhotoItem);
        return intent;
    }

    /**
     * 选择多张图片
     * @param context
     * @param ImageCount  选择照片数目
     * @param showTakePhotoItem  是否有拍照选项
     * @return
     */
    public static Intent pickMultiImage(Context context, int ImageCount, boolean showTakePhotoItem) {
        PhotoPickerIntent intent = new PhotoPickerIntent(context);
        intent.setPhotoCount(ImageCount);
        intent.setShowCamera(showTakePhotoItem);
        return intent;
    }

    /**
     * 预览一组图片
     * @param photoPaths 图片的绝对地址
     * @param currentItem 当前展示的图片order
     * @return
     */
    public static Intent previewImage(Context context, ArrayList<String> photoPaths, int currentItem) {
        PreviewIntent intent = new PreviewIntent(context);
        intent.setCurrentItem(currentItem);
        intent.setPhotoPaths(photoPaths);
        return intent;
    }
}
