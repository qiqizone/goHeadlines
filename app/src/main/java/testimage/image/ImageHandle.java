package testimage.image;

import android.content.Context;
import android.content.Intent;

import java.util.ArrayList;

/**
 * Created by yeming on 2015/9/22.
 */
public interface ImageHandle {

    String IAMGE_PATHS = "image_paths";


    /**
     * 选择一张图片
     * @param context
     * @param showTakePhotoItem  是否有拍照选项
     * @return
     */
    Intent pickSingleImage(Context context, boolean showTakePhotoItem);

    /**
     * 选择多张图片
     * @param context
     * @param ImageCount  选择照片数目
     * @param showTakePhotoItem  是否有拍照选项
     * @return
     */
    Intent pickMultiImage(Context context, int ImageCount, boolean showTakePhotoItem);

    /**
     * 预览一组图片
     * @param photoPaths 图片的绝对地址
     * @return
     */
    Intent previewImage(Context context, ArrayList<String> photoPaths);

}
