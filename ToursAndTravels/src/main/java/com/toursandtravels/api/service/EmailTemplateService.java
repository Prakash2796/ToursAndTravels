package com.toursandtravels.api.service;

import com.toursandtravels.api.model.BookTravelFormWithCarModelRequest;
import org.springframework.stereotype.Service;

@Service
public class EmailTemplateService {

    public String generateBookingEmail(BookTravelFormWithCarModelRequest bookTravelFormWithCarModelRequest) {
        StringBuilder emailContent = new StringBuilder();

        // Add header with company branding
        emailContent.append("<html>")
                .append("<head>")
                .append("<title>Ashoka Tours and Travels - Booking Confirmation</title>")
                .append("<style>")
                .append("body { font-family: Arial, sans-serif; background-color: #f4f4f4; color: #333; }")
                .append("h1 { color: #007BFF; }")
                .append(".email-container { background-color: #ffffff; padding: 20px; border-radius: 8px; }")
                .append(".email-header { background-color: #007BFF; color: #fff; padding: 20px; text-align: center; }")
                .append(".email-header h1 { margin: 0; font-size: 24px; }")
                .append(".email-footer { background-color: #007BFF; color: #fff; padding: 10px; text-align: center; font-size: 12px; }")
                .append(".email-footer p { margin: 5px 0; }")
                .append(".booking-details { list-style-type: none; padding: 0; }")
                .append(".booking-details li { margin-bottom: 10px; }")
                .append(".contact-info { margin-top: 20px; }")
                .append("</style>")
                .append("</head>")
                .append("<body>")
                .append("<div class='email-container'>")
                .append("<div class='email-header'>")
                .append("<h1>Ashoka Tours and Travels</h1>")
                .append("<p>Your Trusted Travel Partner</p>")
                .append("</div>");

        // Add body content
        emailContent.append("<h1>Travel Booking Confirmation</h1>")
                .append("<p>Thank you for booking your journey with Ashoka Tours and Travels! Here are your booking details:</p>");

        // Add booking details if they are not null
        emailContent.append("<h2>Booking Details:</h2>")
                .append("<ul class='booking-details'>");

        if (bookTravelFormWithCarModelRequest.getFullName() != null) {
            emailContent.append("<li><strong>Full Name:</strong> ")
                    .append(bookTravelFormWithCarModelRequest.getFullName()).append("</li>");
        }

        if (bookTravelFormWithCarModelRequest.getPickUpLocation() != null) {
            emailContent.append("<li><strong>Pickup Location:</strong> ")
                    .append(bookTravelFormWithCarModelRequest.getPickUpLocation()).append("</li>");
        }

        if (bookTravelFormWithCarModelRequest.getDropLocation() != null) {
            emailContent.append("<li><strong>Drop Location:</strong> ")
                    .append(bookTravelFormWithCarModelRequest.getDropLocation()).append("</li>");
        }

        if (bookTravelFormWithCarModelRequest.getPhone() != null) {
            emailContent.append("<li><strong>Phone:</strong> ")
                    .append(bookTravelFormWithCarModelRequest.getPhone()).append("</li>");
        }

        if (bookTravelFormWithCarModelRequest.getCabType() != null) {
            emailContent.append("<li><strong>Car Type:</strong> ")
                    .append(bookTravelFormWithCarModelRequest.getCabType()).append("</li>");
        }

        if (bookTravelFormWithCarModelRequest.getCabName() != null) {
            emailContent.append("<li><strong>Car Name:</strong> ")
                    .append(bookTravelFormWithCarModelRequest.getCabName()).append("</li>");
        }

        emailContent.append("</ul>")
                .append("<p>If you have any questions about your booking, feel free to contact us.</p>")
                .append("<div class='contact-info'>")
                .append("<p><strong>Contact Us:</strong></p>")
                .append("<p>Phone: +91 73041 28268</p>")
                .append("<p>Email: sachinshete5085@gmail.com</p>")
                .append("</div>");

        // Add footer with company information
        emailContent.append("<div class='email-footer'>")
                .append("<p>Best Regards,</p>")
                .append("<p>Ashoka Tours and Travels Team</p>")
                .append("<p>&copy; 2024 Ashoka Tours and Travels. All rights reserved.</p>")
                .append("</div>")
                .append("</div>") // Close email-container
                .append("</body>")
                .append("</html>");

        return emailContent.toString();
    }

    public String generateOwnerNotificationEmail(BookTravelFormWithCarModelRequest bookTravelFormWithCarModelRequest) {
        StringBuilder emailContent = new StringBuilder();

        // Add header with company branding
        emailContent.append("<html>")
                .append("<head>")
                .append("<title>Ashoka Tours and Travels - New Booking Request</title>")
                .append("<style>")
                .append("body { font-family: Arial, sans-serif; background-color: #f4f4f4; color: #333; }")
                .append("h1 { color: #FF5733; }")
                .append(".email-container { background-color: #ffffff; padding: 20px; border-radius: 8px; }")
                .append(".email-header { background-color: #FF5733; color: #fff; padding: 20px; text-align: center; }")
                .append(".email-header h1 { margin: 0; font-size: 24px; }")
                .append(".email-footer { background-color: #FF5733; color: #fff; padding: 10px; text-align: center; font-size: 12px; }")
                .append(".email-footer p { margin: 5px 0; }")
                .append(".booking-details { list-style-type: none; padding: 0; }")
                .append(".booking-details li { margin-bottom: 10px; }")
                .append("</style>")
                .append("</head>")
                .append("<body>")
                .append("<div class='email-container'>")
                .append("<div class='email-header'>")
                .append("<h1>Ashoka Tours and Travels</h1>")
                .append("<p>New Booking Request Notification</p>")
                .append("</div>");

        // Add body content
        emailContent.append("<h1>New Booking Request Received</h1>")
                .append("<p>Dear Sachin,</p>")
                .append("<p>You have received a new travel booking request. Below are the details of the customer:</p>");

        // Add booking details
        emailContent.append("<h2>Booking Details:</h2>")
                .append("<ul class='booking-details'>");

        if (bookTravelFormWithCarModelRequest.getFullName() != null) {
            emailContent.append("<li><strong>Customer Name:</strong> ")
                    .append(bookTravelFormWithCarModelRequest.getFullName()).append("</li>");
        }

        if (bookTravelFormWithCarModelRequest.getPickUpLocation() != null) {
            emailContent.append("<li><strong>Pickup Location:</strong> ")
                    .append(bookTravelFormWithCarModelRequest.getPickUpLocation()).append("</li>");
        }

        if (bookTravelFormWithCarModelRequest.getDropLocation() != null) {
            emailContent.append("<li><strong>Drop Location:</strong> ")
                    .append(bookTravelFormWithCarModelRequest.getDropLocation()).append("</li>");
        }

        if (bookTravelFormWithCarModelRequest.getPhone() != null) {
            emailContent.append("<li><strong>Customer Phone:</strong> ")
                    .append(bookTravelFormWithCarModelRequest.getPhone()).append("</li>");
        }

        if (bookTravelFormWithCarModelRequest.getCabType() != null) {
            emailContent.append("<li><strong>Car Type:</strong> ")
                    .append(bookTravelFormWithCarModelRequest.getCabType()).append("</li>");
        }

        if (bookTravelFormWithCarModelRequest.getCabName() != null) {
            emailContent.append("<li><strong>Car Name:</strong> ")
                    .append(bookTravelFormWithCarModelRequest.getCabName()).append("</li>");
        }

        emailContent.append("</ul>")
                .append("<p>Please prepare for this trip. If you need more details or have any questions, feel free to contact the customer.</p>")
                .append("<p>Best Regards,<br>Ashoka Tours and Travels System</p>");

        // Add footer
        emailContent.append("<div class='email-footer'>")
                .append("<p>&copy; 2024 Ashoka Tours and Travels. All rights reserved.</p>")
                .append("</div>")
                .append("</div>") // Close email-container
                .append("</body>")
                .append("</html>");

        return emailContent.toString();
    }


    public String generateBookingEmailOld(BookTravelFormWithCarModelRequest bookTravelFormWithCarModelRequest) {
        StringBuilder emailContent = new StringBuilder();

        // Add header
        emailContent.append("<html>")
                .append("<head><title>Travel Booking Confirmation</title></head>")
                .append("<body>")
                .append("<h1>Travel Booking Confirmation</h1>")
                .append("<p>Thank you for your booking!</p>");

        // Add booking details if they are not null
        emailContent.append("<h2>Booking Details:</h2>")
                .append("<ul>");


        if (bookTravelFormWithCarModelRequest.getFullName() != null) {
            emailContent.append("<li><strong>Full Name:</strong> ")
                    .append(bookTravelFormWithCarModelRequest.getFullName()).append("</li>");
        }

        if (bookTravelFormWithCarModelRequest.getPickUpLocation() != null) {
            emailContent.append("<li><strong>Pickup Location:</strong> ")
                    .append(bookTravelFormWithCarModelRequest.getPickUpLocation()).append("</li>");
        }

        if (bookTravelFormWithCarModelRequest.getDropLocation() != null) {
            emailContent.append("<li><strong>Drop Location:</strong> ")
                    .append(bookTravelFormWithCarModelRequest.getDropLocation()).append("</li>");
        }

        if (bookTravelFormWithCarModelRequest.getPhone() != null) {
            emailContent.append("<li><strong>Phone:</strong> ")
                    .append(bookTravelFormWithCarModelRequest.getPhone()).append("</li>");
        }

        if (bookTravelFormWithCarModelRequest.getCabType() != null) {
            emailContent.append("<li><strong>Car Type:</strong> ")
                    .append(bookTravelFormWithCarModelRequest.getCabType()).append("</li>");
        }

        if (bookTravelFormWithCarModelRequest.getCabName() != null) {
            emailContent.append("<li><strong>Car Name:</strong> ")
                    .append(bookTravelFormWithCarModelRequest.getCabName()).append("</li>");
        }

        emailContent.append("</ul>")
                .append("<p>If you have any questions, please contact us.</p>");

        // Add footer
        emailContent.append("<footer>")
                .append("<p>Best Regards,<br>Travel Service Team</p>")
                .append("</footer>")
                .append("</body>")
                .append("</html>");

        return emailContent.toString();
    }
}
