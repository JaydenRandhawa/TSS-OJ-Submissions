q1 = input()
q2 = input()

if q1 == "y":
    if q2 == "y":
        print("Contact tech support.")
    else:
        print("Check drive contacts.")
else:
    if q2 == "y":
        print("Check the speaker connections.")
    else:
        print("Bring computer to repair center.")
