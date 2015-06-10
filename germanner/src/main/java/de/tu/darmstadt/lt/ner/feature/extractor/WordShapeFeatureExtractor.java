/*******************************************************************************
 * Copyright 2014
 * FG Language Technology
 * Technische Universität Darmstadt
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package de.tu.darmstadt.lt.ner.feature.extractor;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import org.cleartk.ml.Feature;
import org.cleartk.ml.feature.function.FeatureFunction;

public class WordShapeFeatureExtractor
    implements FeatureFunction
{
    public WordShapeFeatureExtractor()
        throws IOException
    {
        // read
    }

    public static final String DEFAULT_NAME = "WordShape";

    @Override
    public List<Feature> apply(Feature feature)
    {

        Object featureValue = feature.getValue();

        return Collections.singletonList(new Feature("WordShape", WordShapeClassifier.wordShape(
                featureValue.toString(), 9)));
    }

}
