import random
names = [
"Advenia Tricahya Wiyono",
"Afrizal Rizqi Syahputra",
"Agustinus Pardamean Lumban Tobing",
"Ajeng Cipta Wening ",
"Alex Sandro Ardian Gole Puka",
"Alvina Krisendi",
"Andrea Lauren Wijaya ",
"Angkianto Laurence",
"Clarensia Novia Hartanoe",
"Cynthia Pandora",
"Daffa Nurmahendra Radya Perdana",
"Evan Audi Widodo",
"Fajar Dwi Kuncoro",
"Felicia Putri Sugianto ",
"Franky William",
"Ghaly Anargya Azzam Rifqi Nahindra",
"Gideon Giyanto",
"Ida Bagus Yogesvara Vyad Chandra",
"Jefferson Timotius Mansur",
"Jeremy Putra Wijaya",
"Justin Valencius Cahyadi ",
"Louwis Steffo Dermawan",
"Marcellino Joshua Kristanto",
"Metta Sari",
"Micheline Glenesia",
"MIchello Rayhan Manuel",
"Mirzha Chaerani", 
"Montgomery Teofilus",
"Nickolas Mathew Geraldinho",
"Rendi Prayata Wibawa",
"Richard Huang",
"Rodrick Felixson",
"Sarah Widya Putri",
"Shandez Darlene",
"Yohanna Yonathan"
]

#Teams
team = []

# Program to make teams of three people each randomly, unique

temp = []
while (len(team)):
    x = random.randint(0, len(names)-1)
    temp.append(names[x])
    names.pop(x)
    if (len(temp) == 3):
        team.append(temp)
        temp = []
    
for t in team:
    print(t)