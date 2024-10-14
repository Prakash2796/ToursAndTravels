package com.toursandtravels.api.utils;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.springframework.util.StreamUtils;

@Component
public class TravelsUtils {

    public byte[] getByteImage(String imagePath) {
        try {

            return StreamUtils.copyToByteArray(new ClassPathResource(imagePath).getInputStream());

        } catch (Exception exception) {

            return null;
        }

    }
}
