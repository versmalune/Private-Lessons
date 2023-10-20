import random

class Building: 
    number_of_floors = 0 
    customer_list = []
    finished_list = []


    def __init__(self, floors, customers):
        self.number_of_floors = floors
        for ID in range(1, customers + 1):
            new = Customer(ID, self.number_of_floors)
            self.customer_list.append(new)

        self.customer_list.sort(key=lambda x: x.ID)
        self.elevator = Elevator(floors, self.customer_list)
        self.run()
        quit()


    def run(self):
        print('\n\n\n********************ELEVATOR IS NOW STARTING********************\n')
        print('There are ', len(self.customer_list), ' customers in the building\n')
        self.output()


    def output(self):
        for customer in self.customer_list:
            print("Customer", customer.ID, "is on floor", customer.current_floor, "and wants to go to", customer.destination_floor)
        print('\n****************************************************************\n')

 
        # ELEVATOR MOVING UP LOOP
        while (self.elevator.current_floor != self.number_of_floors):
            self.elevator.current_floor += 1
            
            print('\n', len(self.customer_list) - len(self.finished_list), 'customers still not delivered to destination.')
            print('\n\n↑-↑-↑-↑-↑-↑-↑-↑-↑-↑- ELEVATOR MOVING UP -↑-↑-↑-↑-↑-↑-↑-↑-↑-↑')
            print('\n\n<FLOOR', self.elevator.current_floor, '>')

            for customer in self.customer_list:
                if (self.elevator.current_floor == customer.current_floor) & (customer.customer_direction == 1) & (customer.finished == True):
                    customer.in_elevator = False

                if (self.elevator.current_floor == customer.current_floor) & (customer.customer_direction == 1) & (customer.finished == False): 
                    customer.in_elevator = True
                    print('Customer', customer.ID, '-> Elevator')

                if (self.elevator.current_floor == self.number_of_floors) & (self.elevator.current_floor == customer.current_floor) & (customer.in_elevator == False) & (customer.customer_direction == -1 or customer.customer_direction == 1) & (customer.finished == False):
                    customer.in_elevator = True
                    print('Customer', customer.ID, '-> Elevator')

                if (self.elevator.current_floor == customer.destination_floor) & (customer.in_elevator == True) & (customer.finished == False) & (customer.customer_direction == 1 or customer.customer_direction == -1):
                    customer.in_elevator = False
                    customer.finished = True
                    customer.current_floor = customer.destination_floor
                    self.finished_list.append(customer)
                    print('Customer', customer.ID, '-> Destination Floor')

            self.customer_list.sort(key=lambda x: x.ID)
            self.finished_list.sort(key=lambda x: x.ID)
            for finished in self.customer_list:
                print('Customer ID:', finished.ID, '          Customer in Elevator:', finished.in_elevator, '          Customer Finished in Elevator:', finished.finished)



        # ELEVATOR MOVING DOWN LOOP
        while (self.elevator.current_floor <= self.number_of_floors) & (self.elevator.current_floor != 1):
            self.elevator.current_floor -= 1
            print('\n', len(self.customer_list) - len(self.finished_list),'customers still not delivered to destination.')
            print('\n\n↓-↓-↓-↓-↓-↓-↓-↓-↓- ELEVATOR MOVING DOWN -↓-↓-↓-↓-↓-↓-↓-↓-↓')
            print('\n\n<FLOOR', self.elevator.current_floor,'>')


            for customer in self.customer_list:
                if (self.elevator.current_floor == customer.current_floor) & (customer.customer_direction == -1) & (customer.finished == True):
                    customer.in_elevator = False

                if (self.elevator.current_floor == customer.current_floor) & (customer.customer_direction == -1) & (customer.finished == False):
                    customer.in_elevator = True
                    print('Customer', customer.ID, '-> Elevator')
                    
                if (self.elevator.current_floor == customer.current_floor) & (customer.customer_direction == -1):
                    customer.in_elevator = True

                if (self.elevator.current_floor == customer.destination_floor) & (customer.in_elevator == True) & (customer.customer_direction == -1):
                    customer.in_elevator = False
                    customer.finished = True
                    customer.current_floor = customer.destination_floor
                    self.finished_list.append(customer)
                    print('Customer', customer.ID, '-> Destination Floor')

            self.customer_list.sort(key=lambda x: x.ID)
            self.finished_list.sort(key=lambda x: x.ID)
            for finished in self.customer_list:
                print('Customer ID:', finished.ID, '          Customer in Elevator:', finished.in_elevator, '          Customer Finished in Elevator:', finished.finished)

        print('\n\n\n◀◀◀◀◀◀◀◀◀ELEVATOR RUN SUMMARY▶▶▶▶▶▶▶▶▶')
        print('\n', len(self.finished_list), 'customers have reached their destination.') 

class Elevator:
    number_of_floors = 0
    register_list = []
    current_floor = 0

    def __init__(self, number_of_floors, register_list):
        self.number_of_floors = number_of_floors
        self.register_list = register_list


class Customer:
    current_floor = 0
    destination_floor = 0
    ID = 0
    in_elevator = False
    finished = False
    customer_direction = 0


   def __init__(self, ID, floors): 
        self.ID = ID
        self.current_floor = random.randint(1, floors)
        self.destination_floor = random.randint(1, floors)
        while self.destination_floor == self.current_floor:
            self.destination_floor = random.randint(1, floors)
        if self.current_floor < self.destination_floor:
            self.customer_direction = 1
        elif self.current_floor > self.destination_floor:
            self.customer_direction = -1


def main():
    try:
        floors = int(input('\n\nEnter the number of floors: '))
        if floors >= 2:
            print('Floors entered: ', floors)
        else:
            print("Wrong Input!")
            main()
        customers = int(input('Enter the number of customers: '))
        if customers >= 1:
            print('Customers entered: ', customers)
        else:
            print('Wrong Input!')
            main()
        building = Building(floors, customers)
    except ValueError:
        print('Wrong Input! Please enter a number!')
        main()

if __name__ == "__main__":
    main()
