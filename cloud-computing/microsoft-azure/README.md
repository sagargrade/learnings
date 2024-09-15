# Microsoft Azure

## Cloud Computing

Cloud computing is the delivery of computing services over the internet ("the cloud") on demand.

> Computing Services - Servers, Storage, Databases, Networking, Software, Analytics and Intelligence

## Shared Responsibility Model

Shared responsibility model classified responsibility of cloud service provide and customer.

|                                 | Resposibility                         | SaaS     | PaaS     | IaaS     | On-prem  |
|---------------------------------|---------------------------------------|----------|----------|----------|----------|
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
|---------|-----------------------------------------|----------------------------------------------|-----------------------------------------------------------------------------------------|
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

## Economy of Scale

Economy of scale is the cost advantage that enterprises obtain due to their scale of operation.

> Capital Expenditure (CapEx) - Upfront cost of physical infrastructure

> Operational Expenditure (OpEx) - Ongoing cost of running infrastructure

| CapEx (On-prem)                            | OpEx (Cloud)                       |
|--------------------------------------------|------------------------------------|
| Full upfront cost                          | No upfront cost                    |
| Saving over time                           | Pay for what you use               |
| Useful when you can predict scale          | Useful in scale/demand fluctuation |
| Usually cheapest on consistent utilization | Can be more expensive in long run  |

## Cloud Service Type

1. Infrastructure as a Service (IaaS) 
2. Platform as a Service (PaaS) 
3. Software as a Service (SaaS)

| IaaS                           | PaaS                               | SaaS                            |
|--------------------------------|------------------------------------|---------------------------------|
| Basic computing infrastructure | Pre-packaged cloud services        | Ready to use applications       |
| Greater customization/control  | Emphasis on application deployment | Focus is on end user experience |
| Pay for what you allocate      | Pay for what you user              | Pay for what you subscribe      |
| More management overhead       | Less management overhead           | Minimal management overhead     |

### Infrastructure as a Service (IaaS)

In this kind of service, cloud vendor is responsible for physical datacenter, network/cabling, physical servers.

> Pay-as-you-go managed IT infrastructure - Virtual Machines(Servers), Networking, Operating System

> Virtual Machines - Virtual version of physical computer (infrastructure) - CPU/Memory, Disk, Networking, OS, Network Controls (Firewall)

> Single physical server (hypervisor) hosts multiple/individual VMs. VMs are completely isolated from each other.

### Platform as a Service (PaaS)

In this kind of service, cloud vendor is responsible for IaaS + Operating System, Development Tools/Database Management/Business Analytics.

> Managed development/deployment Services

> Databases, Software Development tools, Deployment services, Storage services, Business analytics, Security solutions, Serverless (Just run code)

> Serverless - Azure Functions

### Software as a Service (SaaS)

In this kind of service, cloud vendor is responsible for IaaS + PaaS + Hosted Application.

> Cloud based applications

> Email, Office Tools, CRMs





