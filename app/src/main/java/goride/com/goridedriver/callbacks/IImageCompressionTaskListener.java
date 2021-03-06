package goride.com.goridedriver.callbacks;

import java.io.File;
import java.util.List;

/**
 * 6/14/2017.
 */

public interface IImageCompressionTaskListener {
    void onCompressed(List<File> file, int id);
    void onError(Throwable throwable);
}
