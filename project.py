welcome = True

services =[{'name':'Firewall Service', 'price' : 1.2},
{'name':'Security Ops Centre', 'price' : 4.2},
{'name':'Hot Site','price' : 8.5},
{'name':'Data Protection','price' : 10}]

added_service=[]

service_names=[]
for service in services:
    service_names.append(service['name'])
print(service_names)


def searchfunction(query):
    matches = []
    for service in service_names:
        if query in service:
            matches.append(query)
        else: 
            return False



while welcome is True:
    print("=============================================")
    print("Welcome to Electronic Services & Protection :")
    print("=============================================")
    print("\n\n")
    print("1. Display Our List of Services")
    print("2. Search for service")
    print("3. Display added services")
    print("4. Payment")
    print("5. Exit ESP")
    input1 = input("Enter :")
    print(input1)
    if input1 == '1':
        for service in services:
            print(service['name'],':',service['price'],'Per Year')
        input1 = input("Enter :")
    if input1 == '2':
        searchfunction(input("Please input service to search: "))
    if input1 == '3':
         a = a
    if input1 == '4':
        a = a
    if input1 == '5':
        break
