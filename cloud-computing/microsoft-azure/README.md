# Microsoft Azure

## Cloud Computing

Cloud computing is the delivery of computing services over the internet ("the cloud") on demand.

> Computing Services - Servers, Storage, Databases, Networking, Software, Analytics and Intelligence

## Shared Responsibility Model

Shared responsibility model classified responsibility of cloud service provide and customer.

|                                 | Resposibility                         | SaaS     | PaaS     | IaaS     | On-prem  |
| ------------------------------- | ------------------------------------- | -------- | -------- | -------- | -------- |
| Customer's Responsibility       | Information and Data                  | Customer | Customer | Customer | Customer |
|                                 | Devices (Mobile and PCs)              | Customer | Customer | Customer | Customer |
|                                 | Accounts and Identity                 | Customer | Customer | Customer | Customer |
| Responsibility based on service | Identity and Directory Infrastructure | Shared   | Shared   | Customer | Customer |
|                                 | Applications                          | Cloud    | Shared   | Customer | Customer |
|                                 | Network Controls                      | Cloud    | Shared   | Customer | Customer |
|                                 | Operating System                      | Cloud    | Cloud    | Customer | Customer |
| Cloud Provider's Responsibility | Physical Hosts                        | Cloud    | Cloud    | Cloud    | Customer |
|                                 | Physical Network                      | Cloud    | Cloud    | Cloud    | Customer |
|                                 | Physical Datacenter                   | Cloud    | Cloud    | Cloud    | Customer |

## Cloud (Architecture) Models

|         |                                         | Advantages                                   | Disavantages                                                                            |
| ------- | --------------------------------------- | -------------------------------------------- | --------------------------------------------------------------------------------------- |
| Private | Cloud Service on private infrastructure | Organization have full control               | Scaling a challenge (Same as on-prem)                                                   |
|         | On-prem data center                     | Can meet strict security requirements        | Initial cost is high                                                                    |
|         |                                         | Can meet strict data compliance requirements | Provisioning can be time consuming                                                      |
|         |                                         | Align with Org's current model               | Need staffing to manage infrastruture                                                   |
| Public  | Available via public internet           | Scale well                                   | Security concers (Hardware is not uniquely allocated)                                   |
|         | Vendor is responsible for hardware      | Pay as you go on pricing                     | Data Regulations                                                                        |
|         |                                         | Low initial cost                             | Cloud provider has the primary control (Using Specific of cloud provider like DynamoDB) |
| Hybrid  | Mix of private and public cloud or      | Strategy to move to public cloud             | Extra Complexity                                                                        |
|         | Mix of multiple public clouds           | Flexible with costs and regulations          | Costs can be higher than going with one                                                 |
|         |                                         | Supports legacy work flows and architectures | Transitionary Model                                                                     |
