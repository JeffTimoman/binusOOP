 if (book == null){
            System.out.println("Book doesn't exist");
            return;
        }

        if (!(book.isIsAvailable())){
            System.out.println("Book is not available");
            return;
        } 

        userManager.printUsers();