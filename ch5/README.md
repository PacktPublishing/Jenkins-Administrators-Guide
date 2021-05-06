# Chpater 5 - Headfirst AWS for Jenkins

You will be able to find all the links for chapter 5 here. 

## Technical Requirements

1. Creating an AWS account - https://aws.amazon.com/premiumsupport/knowledge-center/create-and-activate-aws-account/
2. Setting up budges and alerts - https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/budgets-create.html 

## Logging into AWS

1. AWS console - https://console.aws.amazon.com/console/home 

## Let's Encrypt

### Automated verification for AWS Route 53

#### Step 2 -- Creating an IAM policy

```json
{
    "Version": "2012-10-17",
    "Statement": [
        {
            "Effect": "Allow",
            "Action": [
                "route53:GetChange",
                "route53:ListHostedZones"
            ],
            "Resource": "*"
        },
        {
            "Effect": "Allow",
            "Action": "route53:ChangeResourceRecordSets",
            "Resource": "arn:aws:route53:::hostedzone/YOURHOSTEDZONEID"
        }
    ]
}
```

## Other DNS providers

|Provider Name|Link to documentation|
|-------------|---------------------|
|GoDaddy      |https://in.godaddy.com/help/add-a-cname-record-19236; https://in.godaddy.com/help/add-a-txt-record-19232|
|Azure        |https://docs.microsoft.com/en-us/azure/dns/dns-operations-recordsets-portal|
|Wordpress    |https://wordpress.com/support/domains/custom-dns/|
|Google Cloud |https://cloud.google.com/dns/docs/records|
|Cloudflare   |https://support.cloudflare.com/hc/en-us/articles/360019093151-Managing-DNS-records-in-Cloudflare|
|Akami        |https://learn.akamai.com/en-us/webhelp/edge-dns/edge-dns-user-guide/GUID-686C0A1A-511E-4C50-97A8-54B23CE68FFD.html|
|Alibaba      |https://partners-intl.aliyun.com/help/doc-detail/27144.htm|
|Oracle Cloud |https://docs.oracle.com/en-us/iaas/Content/DNS/Tasks/managingdnszones.htm#Managing_DNS_Service_Zones|
|IBM Cloud    |https://cloud.ibm.com/docs/dns-svcs?topic=dns-svcs-managing-dns-records|
