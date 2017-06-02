package org.bigmamonkey.modelBuilder;

import org.bigmamonkey.core.IModelBuilder;

import java.util.Arrays;
import java.util.List;

/**
 * Created by bigmamonkey on 6/2/17.
 */
public class JsonModelBuilder implements IModelBuilder<Object> {
    @Override
    public List<Object> buildDataModels(Object config) throws Exception {
        return Arrays.asList(config);
    }
}
