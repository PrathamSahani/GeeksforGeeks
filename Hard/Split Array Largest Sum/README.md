<h2><a href="https://practice.geeksforgeeks.org/problems/f04fd67b26b4828b6180715d8b1700426b637247/1?page=1&status[]=unsolved&company[]=Amazon&company[]=Microsoft&company[]=Flipkart&company[]=Adobe&company[]=Google&company[]=Samsung&company[]=Accolite&company[]=MakeMyTrip&company[]=Snapdeal&company[]=Zoho&company[]=Paytm&company[]=Walmart&company[]=Goldman%20Sachs&company[]=Morgan%20Stanley&company[]=FactSet&company[]=D-E-Shaw&company[]=Ola%20Cabs&company[]=Oracle&company[]=MAQ%20Software&company[]=Facebook&company[]=SAP%20Labs&company[]=VMWare&company[]=Qualcomm&company[]=Cisco&company[]=Intuit&company[]=Linkedin&company[]=Yahoo&company[]=Payu&company[]=BankBazaar&company[]=Synopsys&company[]=Codenation&company[]=PayPal&company[]=24*7%20Innovation%20Labs&company[]=TCS&company[]=Twitter&company[]=Yatra.com&company[]=Bloomberg&company[]=Oxigen%20Wallet&company[]=Accenture&company[]=Apple&company[]=Myntra&company[]=CouponDunia&company[]=Amdocs&company[]=Belzabar&company[]=Rockstand&company[]=Expedia&company[]=Boomerang%20Commerce&company[]=Times%20Internet&company[]=Infosys&company[]=Veritas&company[]=Juniper%20Networks&company[]=United%20Health%20Group&company[]=Uber&company[]=IBM&company[]=GreyOrange&company[]=Sapient&company[]=ABCO&company[]=Airtel&company[]=Junglee%20Games&company[]=Polycom&company[]=Philips&company[]=Medlife&company[]=National%20Instruments&company[]=Tejas%20Network&company[]=nearbuy&company[]=Tesco&company[]=IgniteWorld&company[]=Dell&company[]=Komli%20Media&company[]=DE%20Shaw&company[]=Intel&company[]=redBus&company[]=American%20Express&category[]=Binary%20Search&sortBy=submissions">Split Array Largest Sum</a></h2><h3>Difficulty Level : Hard</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given an array <strong>arr[]</strong> of <strong>N</strong> elements and a number <strong>K</strong>. Split the given array into K subarrays such that the maximum subarray sum achievable out of K subarrays formed is minimum possible. Find that possible subarray sum.</span></p>

<p><br>
<span style="font-size:18px"><strong>Example 1:</strong></span></p>

<div style="background:#eee;border:1px solid #ccc;padding:5px 10px;"><span style="font-size:18px"><strong>Input:</strong><br>
N = 4, K = 3<br>
arr[] = {1, 2, 3, 4}<br>
<strong>Output: </strong>4<br>
<strong>Explanation:</strong><br>
Optimal Split is {1, 2}, {3}, {4}.<br>
Maximum sum of all subarrays is 4,<br>
which is minimum possible for 3 splits.&nbsp;</span></div>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<div style="background:#eee;border:1px solid #ccc;padding:5px 10px;"><span style="font-size:18px"><strong>Input:</strong><br>
N = 3, K = 2<br>
A[] = {1, 1, 2}<br>
<strong>Output:</strong><br>
2<br>
<strong>Explanation:</strong><br>
Splitting the array as {1,1} and {2} is optimal.<br>
This results in a maximum sum subarray of 2.</span></div>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
The task is to complete the function <strong>splitArray</strong>() which returns the maximum sum subarray after splitting the array into K subarrays such that maximum sum subarray is minimum possible.</span></p>

<p><br>
<span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ N ≤ 10<sup>5</sup><br>
1 ≤ K ≤ N<br>
1 ≤ arr[i] ≤ 10<sup>4</sup></span></p>

<p><br>
<span style="font-size:18px"><strong>Expected Time Complexity:&nbsp;</strong>O(N*log(sum(arr))).<br>
<strong>Expected Auxiliary Space:&nbsp;</strong>O(1).</span></p>
</div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Google</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Arrays</code>&nbsp;<code>Binary Search</code>&nbsp;<code>Data Structures</code>&nbsp;<code>Algorithms</code>&nbsp;