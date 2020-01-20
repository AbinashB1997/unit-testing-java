import os
from email.mime.multipart import MIMEMultipart
from email.mime.text import MIMEText
from email.mime.image import MIMEImage
import smtplib
import email_credentials as ec


msg = MIMEMultipart()

def send_email(user, pwd, recipient, subject, body):
    file = open("output.txt", "r")
    msg.attach(MIMEText(file.read()))
    FROM = user
    TO = recipient if isinstance(recipient, list) else [recipient]
    SUBJECT = subject
    TEXT = body

    # Prepare actual message
    message = """From: %s\nTo: %s\nSubject: %s\n\n%s
    """ % (FROM, ", ".join(TO), SUBJECT, TEXT)
    try:
        server = smtplib.SMTP("smtp.gmail.com", 587)
        server.ehlo()
        server.starttls()
        server.login(user, pwd)
        server.sendmail(FROM, TO, msg.as_string())
        server.close()
        print ('successfully sent the mail')
    except:
        print ("failed to send mail")
    file.close()

send_email(ec.sender(), ec.token(), ec.receiver(), 'REPORT', 'Your exam result')